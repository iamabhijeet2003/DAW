#include <stdio.h>

int suma (int op1,int op2){
    return (op1+op2);
}

int resta(int op1,int op2){
 return (op1-op2);
}

int multiplica(int op1, int op2){
    return (op1*op2);
}

int divideix(int op1, int op2){
    return (op1/op2);
}

int major(int op1, int op2){
    if(op1>op2)
        return op1;  
    
    else
        return op2;
}

