//Write a JS code to print Even numbers in given array

let array = [1,2,3,4,5,6,7,8,10,10202,101,1010101,10343,223,2234,442,231];

function imprimir_num_par(){
    for(let i = 0;i< array.length;i++){
        if(array[i]%2==0){
            console.log(array[i]);
        }
    }
}