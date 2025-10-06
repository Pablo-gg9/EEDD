# Git
## Que es git?


Git es un sistema de control de versiones distribuidos,permite llevar un registrode los cambios que se hacen en un proyecto y posteriormente sincronizarlos con un servidor. 

Git permite saber a traves de los commits que se ha cambiado,quien lo ha cambiado, deshacer cambios y trabajar en equipo.
## Ubicaciones

- **Directorio de trabajo** : Carpeta en el ordenador donde tienes los archivos del proyecto con los que estas trabajando actualmente.
- **Repositorio local** : Version "Oculta" del proyecto git. Es donde git guarda el historial de cambios en nuestro ordenador.
- **Repositorio Remoto** : Copia del repositorio local que esta almacenado en un servidor externo. Imprescindible para hacer publicos los cambios y colaborar.


## Sintaxis de git

Git utiliza varios comandos especificos para diversas funciones:

- **git commit -m "mensaje"** :Este comando nos permite guardar el progreso entre nuestro directorio de trabajo y nuestro repositorio local.
- **git init < directorio>**: Transforma el directorio actual en un repositorio de git
- **git clone < direccion >** :Permite descargar un repositorio remoto
- **git status** : Muestra que archivos  se han modificado 
- **git diff** :Muestra los cambios dentro de los archivos.
- **git push** :Sube los cambios del repositorio local al repositorio remoto.
- **git pull** :Descarga que los cambios que haya en el repositorio remoto.
- **git rm**: Borra un archivo a elegir.



#### Ejemplos:

![git-commit](/T1/img/git%20commit.PNG)


---


![git-push](/T1/img/git%20push.PNG)

---

![git-status](/T1/img/git%20status.PNG)

----

![git-add](/T1/img/Git%20add.PNG)

---

![git-pull](/T1/img/pull.PNG)

### Configurar Git:

Para poder configurar Git necesitamos hacer uso en la terminal de **Git Bash** de los siguientes comandos:

```bash
git config --global user.name "Nombre del Usuario de Github"
git config --global user.email "Gmail del usuario de Github@dominio.ejemplo.com"
```