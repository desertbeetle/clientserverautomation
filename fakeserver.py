import time
import sys

for i in range(5):
	time.sleep(1)
	sys.stdout.write("%d\n" % i)
	sys.stdout.flush()