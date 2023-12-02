calcula: calculadora.c calc.o
	gcc -Wall -g calculadora.c calc.o -o calcula
calc.o: calc.c calc.h
	gcc -g -Wall -c calc.c -o calc.o
	
.PHONY: dist
dist: clean calculadora
	rm -rf ../dist;
	mkdir -p ../dist/usr/bin/calc
	cp calculadora ../dist/usr/bin/calc

.PHONY: targz
targz: clean
	mkdir -p source
	cp *.c *.h Makefile source
	tar -cvf calculadora.tar source
	gzip calculadora.tar
	rm -rf calculadora.tar
	rm -rf source

install: dist
	cp -r ../dist/* /

