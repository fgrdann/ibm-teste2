
# IBM - Teste técnico #2

  

O programa percorre apena uma vez os caracteres do String de entrada, já montando um possível String resultante, que é inicializado como "".

Cada vez que o programa encontra um caractere ausente no string resultante, assume que há a necessidade de incluí-lo.

Caso tenha passado por outros caracteres repetidos antes de chegar no caractere inédito, estes também são guardados para serem incluídos.

Quando encontra um caractere repetido, verifica se este está no início da cadeia resultante atual e remove-o para que seja substituído pelo último. Se não estiver no início, o caractere é guardado para ser incluído quando necessário.

Em seguida, verifica-se a necessidade de remover os caracteres "guardados" no início da cadeia resultante atual.

Ao final da iteração, verifica-se se o string resultante desta iteração é menor que o string tido como menor até então, que foi inicializado com o valor original de entrada.