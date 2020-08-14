import subprocess
import time
import threading
import signal
import os

#############
server_cmd = "java -jar .\\out\\artifacts\\server_jar\\server.jar"
server_ready_pattern = "server ready!"
client_cmd = "java -jar .\\out\\artifacts\\client_jar\\client.jar"
#############

def start_client(server_proc):
	client = subprocess.call(client_cmd.split(), shell=True)
	print (client)
	print ("![test  ] server")
	os.kill(server_proc.pid, signal.SIGTERM)

def start_server():
	proc = subprocess.Popen(server_cmd.split(),shell=True,stdout=subprocess.PIPE)

	while True:
		time.sleep(0.1)
		line = proc.stdout.readline()
		if not line: break
		print ("![server]", line.strip())
		if (line.strip() == server_ready_pattern):
		    threading.Thread(target=start_client, args=(proc,)).start()
	proc.wait()
	print ("![test  ] server killed")

if __name__ == '__main__':
	start_server()