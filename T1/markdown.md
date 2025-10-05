# Manual Basico de Markdown.

![Logo_markdown](/img/Logo_Markdown.png)

## ¿Que es markdown?

Markdown es un lenguaje de marcas que facilita la aplicacion de formato a un texto empleando una serie de caracteres de una forma especial .En principio, fue pensado para elaborar textos cuyo destino iba a ser la web , con mas rapidez y sencillez que si estuvieramos empleando directamente HTML. Y si bien ese suele ser el mejor uso que podemos darle , tamien podemos emplearlo para cualquier tipo de texto, independientemente de cual vaya a ser su destino. 


## Sintaxis:

En markdown se utilizan una serie de combinaciones de caracteres ordenados de una manera especifica para poder expresar cosas a destacar.

        Ejemplo nº1:
        Heading/titulo
        #TITULO

- Se utiliza el simbolo "#" para expresar un titulo dejando seguido de este un espacio para remarcar el nombre del titulo. Esta expresion tambien da lugar a varios subtitulos añadiendo varios "#" dependiendo de la importancia de cada uno.  

        Ejemplo nº2:
        Negrita/bold text.
        **Texto**

- Para poder expresar una palabra a la cual le quieres dar **importancia** dentro de un texto grande se usa la sintaxis anteriormente vista.

        Ejemplo nº3:
        Cursiva/Italic.
        *Texto*

- Para poder poner en cursiva una *palabra* se utiliza la sintaxis anteriormente vista 

        Ejemplo nº3.5:
        Cursiva y negrita/Italized and bold text.
        ***Texto***

- Para remarcar un ***texto*** en en cursiva y en negrita se usa la sintaxis vista en el ejemplo.

        Ejemplo nº4:
        Cajas de comentarios:
            Textos.

- Como ya llevamos viendo durante toda la guia para sobreponer una caja de comentarios, debemos tabular almenos una vez para que la caja aparazca, cabe recalcar que dentro de ella solo se visualizara el texto integro y no se aplicara la sintaxis habitual de Markdown.

        Ejemplo nº5:
        Listas organizadas.
        1.
        2.
        etc.

- Para lograr una lista organizada/enumerada de una serie de elementos se utiliza el numero junto a un punto para poder verla enumerada, se uilizaran tantos numeros como elementos necesarios

        Ejemplo nº6:
        Listas no organizadas
        - Ejemplo
        - Ejemplo
        - etc.

- Al igual que con los comentarios de texto estas listas no organizadas para hacer comentarios puntuales las llevamos haciendo durante toda la guia y su sintaxis es como en el ejemplo.

        Ejemplo nº7:
        Tablas
        |Operacion  | Resultado     |
        |-----------|---------------|
        | 2*2       |   4           |
        |   4*2     |   8           |
        |     7*2   |  14           |

- Estas tablas se aplican segun esta sintaxis encontramos un ejemplo de su visualizacion en la [guia de git](git.md).


        Ejemplo nº8:
        Enlaces:
        [Texto a mostrar](Nombre de archivo/ruta del buscador)

- Segun la sintaxis de arriba con este atajo evitaremos poner en bibliografias la direccion de las referencias tomadas y nos permitira movernos entre archivos de el mismo repositorio.

        Ejemplo nº9:
        Imagenes:
        ![texto de la imagen](Nombre de la imageno ruta de esta /url de la misma)

- Con este ejemplo le podremos dar vida a nuestro documento de texto apoyandonos en imagenes, igualmente encontraremos un ejemplo grafico en la [guia de git](git.md).

        Ejemplo nº10:
        Codigo:
        ```bash
        pwd
        ```

- Este comando se utiliza para expresar un fragmento de codigo segun el lenguaje que nosotros querramos , igualmente encontraremos un ejemplo grafico en la [guia de git](git.md).