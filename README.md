# toywars

1. Toy wars 1.1. Genera tu juego con una API REST En esta práctica vas a generar un juego que recreará a los conocidos
   Tamagochi, en donde podrás alimentar, cuidar o entrenar a tu mascota o dibujo favorito para que evolucione a lo que
   quieras. ¿Como generaras ese videojuego? No va a ser sencillo, preparate!
   1.2. Preparación del entorno Descripción técnica del juego:
   A partir de una api rest, el jugador va a iniciar sesión y tendrá asociado un muñeco. Cuando tenga el juguete de tipo
   LifeBeing creado, podrá chequear las acciones a realizar e ir avanzado como tu quieras para conseguir puntos. En cada
   momento que se genera una acción, el estado del LifeBeing cambiará y, en consecuencia, se obtendrá una imagen o
   renderizado distinto. El juego consta en adivinar que secuencia de acciones para cada LifeBeing hacen que se consiga
   la máxima puntuación o, en consecuencia, cuales de ellas entristecen tanto al LifeBeing que conseguirán que se aleje
   de la alegría de vivir!
2. Gestión del entorno Trabaja por parejas utilizando el plugin de pair programming de intellij "Code with me"
   https://www.jetbrains.com/help/idea/code-with-me.html#share_and_work

   2.1. API Rest

   El punto de entrada REST será el que te permita interactuar con la aplicación. El usuario tendrá las siguientes
   acciones:

    + /rest/do/{action} : Devuelve un mensaje en JSON
    + /rest/getCurrentStatus : Devuelve un mensaje Status en JSON
    + /rest/getStats : Devuelve un mensaje Stats
    + /rest/render/{mode} : devuelve un String como body
    + /rest/new : Devuelve el LifeBeing
    + /rest/getActions : Devuelve un listado de IActions

   Para implementarlas, generar un RestController para cada uno de los métodos y prueba que funcionan.Tanto "action"
   como "mode" serán enums.

3. Los datos

   Para que todo pueda funcionar, tendrás que generar la estructura de datos necesaria. Para eso, realiza lo siguiente:
   + Genera una clase UserAction Esta clase representa un registro del momento en el que se ha ejecutado la action, el
      tipo de juguete sobre el que se ha realizado, los puntos de inicio, y los puntos conseguidos
   + GeneraunaclaseStatus.ElstatuseselestadodelLifeBeing,puedesanotar tantos detalles como quieras, o simplemente un
      número de puntos.
   + Genera un enum Actions. Serán las acciones que permites que se hagan durante el juego
   + GeneraunenumRenderType
   + Genera una interfaz que implemente cada una de las actions (doXXX) y además un método "getCurrentActions()" que
      devuelve un listado de Actions.
   + Genera una interfaz IRender. Esta interfaz tendrá un método doRender(Rendertype).
   + Genera una clase abstracta LifeBeing. Todo juguete de tu aplicación será un LifeBeing, así podrás conectar tantos
      tipos de figuras como quieras: Tamagochi, Pokemo, Gijoe.. Tu Lifebeing debe extender la interfaz IActions y
      contener un status. También debe extender la interfaz IRender. Puede implementar los métodos que consideres.
   + Genera una clase que implemente LifeBeing y contenga un status en su interior además de los atributos necesarios.
      Esta clase gestionará, según las acciones y en el estado en el que está el número de acciones posibles.

4. El centro neural del juego

   A través de una clase denominada GameService, tendremos toda la lógica de nuestra Genera una clase de tipo @service
   que realice lo siguiente:
   + Contendrá un atributo único denominado UserActions que se almacenará como una lista de acciones de tipo
      UserAction.
   + Contendrá un atributo único denominado maxPoints.
   + Contendrá un atributo único denominado currentLifeBeing, que será la instancia única a la que los usuarios están
      interactuando
   + Además, contendrá los siguientes métodos:

      + doAction(Action): generará una cambio en el status del LifeBeing. Este cambio vendrá dado por la lógica que tu
          consideres.
      + resetLifeBeing(...): reiniciará el lifeBeing. No modifica las acciones realizadas ya que es una nueva accion
      + render: devuelve el renderizado del LifeBeing como creas necesario
      + getStatus: devuelve el status del LifeBeing
      + getActions:devuelveunlistadodeaccionesquesepuedenhacereneste momento. Recuerda que el listado puede variar del
          momento en el que se encuentra el LifeBeing
      + getUserActions: devuelve un listado de todos los cambios que se han intentado hacer desde el inicio del juego.

   4.1. A realizar

    + ConestoyapodrásjugarporREST.
    + Puedes hacer un formulario o botones en html para llamar cada una de las acciones y pintar el resultado en un
      canvas, para interactuar por web
    + Puedes hacer una aplicación de consola en un test para probar el juego a partir de tests sobre el servicio.