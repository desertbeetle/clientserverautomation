## Client-Server Testing Automation

### Description

When the server is started, it wait for client to connect.  When client is started, it sends 5 messages to the server and the server response the client by echoing the message. The last message contains keyword "exit". The server responses to the "exit" message by breaking out the loop and stop. 

### Set Up

1. Open Command Prompt
2. mkdir C:\cs_test
3. cd C:\cs_test
4. Clone the repository
5. Open as project in IntelliJ

### Build server.jar

1. Open project in IntelliJ
2. Build | Build Artifacts
3. Server.jar | Build

### Build client.jar

1. Open project in InterlliJ
2. Build | Build Artifacts
3. Client.jar | Build

### Testing Steps - Manual 

1. Start Server
   1. Open command prompt
   2. `cd C:\cs_test`
   3. `java -jar out\artifacts\server_jar\server.jar`
2. Run Client
   1. Open another command prompt
   2. `cd C:\cs_test`
   3. `java -jar out[artifacts\client_jar\client.jar`





