let currentInput = "";
let result = "";

function appendToDisplay(value) {
    currentInput += value;
    document.getElementById("result").textContent = currentInput;
}

function clearDisplay() {
    currentInput = "";
    result = "";
    document.getElementById("result").textContent = "0";
}

function calculateResult() {
    try {
        result = eval(currentInput);
        document.getElementById("result").textContent = result;
        currentInput = result.toString();
    } catch (error) {
        document.getElementById("result").textContent = "Ya es hora de ir a casa!!";
    }
}
