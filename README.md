# Curso de Programación Orientada a Objetos (POO)
**Table of Contents**

## ¿Qué vimos en el curso?  
El **Curso de Programación Orientado a Objetos** nos enseña lo util,  practico y  necesario  que es programar usando la programación orientada a objetos al momento de resolver un problema.

Trabajamos 4 diferentes sistaxis al programar orientado a objetos, usamos la sintaxis de **Java, JS, PHP y Python** en cada unos de los lengaje de programación vimos como usar las clases, como llamar una clase desde el main entre muchas otras otras.
Trabajamos en un proyecto donde usamos a **Uber** como referencia.
[Link al curso](https://platzi.com/clases/oop/)

### Proyecto Uber
EL proyecto fue un reto total ya que usamos diferentes factores y sitaciones de la famosa aplicacion, analizamos sus problemas y los dividimos en **Objetos** para darles soluciones, para esto usamos sus diferentes modalidades de viaje como los son *Uber X, Uber Pool, Uber Black y Uber SUV* (ero en el curso usamos el nombre de uber VAN). En el que dimos solución esquematizando sus problemas con UML (Unified Modeling Language).

## Tecnologias usadas
Usamos:
- Java
- JavaScript
- PHP
- Python
- Windows Subsystem for LInux 2 (WSL2)

### Algunas anotaciones del curso
Durante el trascurso del curso trate de tomar apuntes muy específicos que me han servido de ayuda en casi de repasar algo que no tenga muy claro o que simplemente necesite recordar.
Espero les sirvan como a mí. 
Da click **[sobre este enlace](https://www.notion.so/Curso-de-programacion-orientado-a-objetos-POO-ca5d50d91b654a3a8aaecec8e6031b3b)** para ir a los apuntes.

### Comandos Usados en el curso
- pwd = para ver en qué ruta de nuestro sistema está posicionado el terminal

- git init = para iniciar un proyecto nuevo (una sóla vez por repositorio)

- git status = para ver el estado de mis archivos

- git status -s = solo muestra los archivos modificados

- git show: Mostrara todos los cambios que hemos hecho, esto incluye las líneas que hemos cambiado, cuando y quien hizo dicho cambios.

- git add Nombre del Archivo = para agregar un archivo al staging area

- git add. = Agrega todos los archivos que hayan cambiado en la carpeta donde estás parado.(Después de $ git add . se suele hacer un commit para actualizar la base de datos)

- git commit = para crear un primer punto de control de nuestro código

- git commit -m “mensaje a escribir” = si quieres enviar algún mensaje

- git commit -am = es un “git add” automático de los cambios(funciona con los archivos a los cuáles ya les hiciste “git add” previamente)

- git config --global user.email ["you@example.com](mailto:%22you@example.com)" = para configurar el email del usuario

- git config --global -l = para visualizar el usuario y el e-mail

- git log Nombre del Archivo = para ver todos los commit que se han creado

- git log --stat = ver todos los cambios específicos que se hicieron en los archivos a partir del commit(con la “q” salgo de ahí)

- git log --all --graph --decorate --oneline = para ver todos los commit de manera más comprimida(alias unaliascualquiera=“git log --all --graph --decorate --oneline” = Para ponerle un alias y que sea más fácil acordarse, en mi caso, es “todosloscommits”)

- git checkout = para cambiar rápidamente de rama

- git checkout – “Nombre del archivo” = para revertir los cambios de los archivos

- git checkout -b Nombre de la nueva rama = Crea una rama a partir de la que te encuentres parado con el nombre “nombre_rama_nueva”, y luego salta sobre la rama nueva, por lo que quedas parado en esta última.

- git checkout -t origin/Nombre de la rama = Si existe una rama remota de nombre “nombre_rama”, al ejecutar este comando se crea una rama local con el nombre “nombre_rama” para hacer un seguimiento de la rama remota con el mismo nombre.

- git checkout Nombre de la rama a la cual quiero cambiar = Auto descriptivo

- git checkout Nombre del commit Nombre del archivo = para ver cómo era un archivo antes(también se puede con “git checkout master Nombre del archivo” aunque no es lo mismo, ojo)

- git diff Nombre del archivo = para ver las diferencias hechas en los archivos(se puede hacer también con “git diff Número del commit 1 Número del commit 2”)

- git show = todos los cambios históricos realizados(la misma función se puede realizar con el comando git log -nombre de archivo-)

- git show-ref --tags = para ver a qué commit está conectado un Tag

- git show-branch = para ver todas las ramas que existen y su historia(“git show-branch --all” = lo mismo pero más detallado)

- git pull = Para traer los archivos o cambios a un servidor remoto.

- git log --oneline = Muestra en una línea los commit realizados

- git reset --hard “Número del commit” = Viajamos al commit en específico “Número del commit” y eliminamos los cambios futuros

- git push = subir todos los cambios locales al servidor remoto de github

- git push origin Nombre de la rama = Commitea los cambios desde el branch local origin al branch “nombre_rama”.

- git push origin --tags = para enviar todos los tags al repositorio

- git pull = Cuando realizamos cambios directamente en github pero no de forma local para descargar los cambios realizados

- git pull origin master = para hacer un pull desde el origin remoto (en rama master) y luego el merge a la rama

- git fetch = compara los archivos locales con los del servidor(si hay alguna diferencia nos pediría realizar un get pull para hacer un match de los archivos locales)

- git tag Nombre de la version -m “Descripción de la versión” = para hacer versiones de nuestro proyecto.

- git tag -d Nombre del tag = para borrar un tag

- git push --tags = subir los tags

- git branch = para ver todas las ramas

- git branch Nombre de la rama = para crear una rama

- git branch -a = Lista todas las ramas locales y remotas.

- git branch -d Nombre de la rama = Elimina la rama local con el nombre “nombre_rama”.

- git branch -d Nombre de la rama = para borrar una rama

- git merge Nombre de la rama a unir = para unir una rama a la rama “master”(para eso hay que ubicarse en la rama “master”, no desde la rama a unir)

- git remote prune origin = Actualiza tu repositorio remoto en caso que algún otro desarrollador haya eliminado alguna rama remota.

- git reset --hard HEAD = Elimina los cambios realizados que aún no se hayan hecho commit.

- git tag -a Nombre del Tag -m “Mensaje del Tag” Número del Tag = para los Tags

- gitk = ver todo de manera más agradable a la vista


## Conclusiones
El curso es muy claro, nos explica de una menera clara como es que la **Programación Orientada a Objetos (POO)** nos ayuda a solucionar los problemas de nuestros clientes de una manera practica, sencilla y eficiente. Nos enseña el uso de los objetos como una manera rapida y segura de saber donde se encuentra nuestro problema en caso de que el programa no se ejecute de manera correcta. }
Sin duda la POO nos ayuda a programar rapido, mas limpio, con menos codigo, de una manera mas eficiennte y sobre todo es una tecnica que ayuda a todos los integrantes involucrados en e proyecto a saber que y como lo podemos hacer, tambien a encontrar los problema o bugs mas rapido en caso de que se tenga que los haya y repararlos.
El curso es sencillo pero muy bueno.

##### Edita los archivos con extensiones **.md**
[Edita aqui archivos .md](https://pandao.github.io/editor.md/en.html#H2%20Header%20(Underline))

### End
