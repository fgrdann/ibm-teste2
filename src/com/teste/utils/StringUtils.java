package com.teste.utils;


public class StringUtils {

	public int shortestSubstring(String s) {
		int res = -1;
		//verifica se o input está adequado, se não, retorna -1
		if (!s.matches("[a-z]+") || s.length() < 1 || s.length() > 100000) {
			return res;
		}
		String substr = "";//string temporário
		String shortest = s;//menor string encontrado até o momento
		String nextSubstr = "";//string guardado para ser incluído caso seja necessário
		
		//percorre todos os caracteres de s
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			//verifica se o caractere é repetido em substr
			if (substr.indexOf(c)>=0) {
				boolean add = false;
				//verifica se o caractere é o primeiro, se sim, é removido
				while(substr.indexOf(c)==0) {
					substr = substr.substring(1);
					add = true;
				}
				nextSubstr += c;//inclui o caractere atual para ser incluído depois, caso seja necessário
				boolean proceed = false;
				/*verifica a necessidade de remover outros caracteres no início da cadeia que já serão contemplados ao incluir
				 *nextSubstr
				 * 
				 */
				while (!proceed) {
					proceed = true;
					for (int j = 0; j < nextSubstr.length(); j++) {
						char cj = nextSubstr.charAt(j);
						while (substr.indexOf(cj)==0) {
							substr = substr.substring(1);
							proceed = false;
							add = true;
						}
					}
				}
				if (add) {//removidos os caracteres do início da cadeia, adiciona os caracteres guardados ao final e zera-os
					substr += nextSubstr;
					nextSubstr = "";
				}
				if (substr.length() < shortest.length()) {//verifica se o substring resultante desta iteração é menor que o atual
					shortest = substr;
				}
			}else {/*
					*caractere inédito: adiciona-o ao final, juntamente com os outros caracteres anteriormente guardados
					*e assume este substring como menor até o momento
					*/
				substr += nextSubstr + c;
				shortest = substr;
				nextSubstr = "";
			}
		}
		res = shortest.length();
		return res;
	}
}
