# jumia-tech-challenge

## Server 

1. For running the server go to server directory /server/phone-numbers

2. Build the server as a container with this command using the terminal:
`docker build -t phone-numbers-server .`

3. Run the container with this command using the terminal:
`docker run -p 8087:8087 phone-numbers-server`

4. To exit the server container use Ctrl+C

## Client

1. For running the client go to client directory: /client/angular8-phone-numbers

2. Build the client as a container with this command using the terminal:
`docker build --rm -t phone-numbers-client .`

3. Run the container with this command using the terminal:
`docker run --rm -d -p 4100:80/tcp phone-numbers-client`

4. Now you can browse to http:localhost:4100, you will now see the application running.


Thanks for the challenge Jumia it was a good opportunity to learn new things like using a Docker container. 
