# springbootdockerimage
 ## Containerize Springboot application with Docker images
 ![main](https://github.com/sada498/springbootdockerimage/blob/master/src/main/resources/static/images/main.PNG)
 ### To work with is application.
     git clone https://github.com/sada498/springbootdockerimage.git

   **Note:** as java developer you would have Java and Maven configured for Local development.

###  To build a springboot application 
    ./mvnw install
###  To Containerize the Spring Application with Maven:
    ./mvnw spring-boot:build-image
    
   **Note:** you need to docker running local environment to Containerize the Spring Application. If not, you get build failure log on     your terminal.

### You can check the jar file in folder 
    target/
![Image of target](https://github.com/sada498/springbootdockerimage/blob/master/src/main/resources/static/images/target%20folder.PNG)

  **Start the Docker daemon on Linux  or ubuntu**
  
   ```sudo systemctl start docker ```
   
   ```sudo service docker start ```
   
   **Start the docker daemon in windows start menu>docker desktop >start**

### To run the spring boot application jar in local docker container
    docker run -p 8080:8080 springbootdockerimage:0.0.1-SNAPSHOT
![docker run](https://github.com/sada498/springbootdockerimage/blob/master/src/main/resources/static/images/docker%20run.PNG)
### check the application running locally
    localhost:8080
## Push docker image to docker hub
 Firstly, you need [Docker Hub](https://hub.docker.com/) account. 
 You have to authenticate with Dockerhub local environment
   docker login
 
### Create a docker image for the application locally
	   docker tag springbootdockerimage:0.0.1-SNAPSHOT sada498/ska:0.0.1
### Push that docker image to private or public repo in docker hub
    docker push sada498/ska:0.0.1
![Image of docker push](https://github.com/sada498/springbootdockerimage/blob/master/src/main/resources/static/images/docker%20push.PNG)
### Check the your docker image ska:0.0.1 in docker hub account
![Image of docker hub](https://github.com/sada498/springbootdockerimage/blob/master/src/main/resources/static/images/docker%20hub.PNG)

