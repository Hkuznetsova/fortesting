@echo off
start/min "cmd" java -jar selenium-server-standalone-2.53.1.jar -role hub -port 4444

start/min "cmd" java -jar selenium-server-standalone-2.53.1.jar -role webdriver -hub http://localhost:4444/grid/register -port 5558 -browser browserName=firefox