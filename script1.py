from subprocess import *

import subprocess


server_jar = ".\\out\\artifacts\\server_jar\\server.jar"

cmd = 'java -jar ' + server_jar
cmd = cmd.split()
subprocess.Popen(cmd, shell=True)

client_jar = ".\\out\\artifacts\\client_jar\\client.jar"

cmd = 'java -jar ' + client_jar
cmd = cmd.split()
subprocess.Popen(cmd, shell=True)

