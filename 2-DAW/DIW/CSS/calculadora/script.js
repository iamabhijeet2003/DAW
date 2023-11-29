let displayValue = '';

function appendToDisplay(value) {
    console.log(`Clicked: ${value}`);
    displayValue += value;
    document.getElementById('valor').textContent = displayValue;
}


function calculateResult() {
    try {
        const result = eval(displayValue);
        document.getElementById('valor').textContent = result;
        displayValue = result.toString();
    } catch (error) {
        document.getElementById('valor').textContent = 'Error';
        displayValue = '';
    }
}


function clearDisplay() {
    displayValue = '';
    document.getElementById('valor').textContent = '0';
}


document.querySelector('.boton2').addEventListener('click', clearDisplay);

function deleteLastCharacter() {
    displayValue = displayValue.slice(0, -1);
    document.getElementById('valor').textContent = displayValue || '0';
}


function toggleSign() {
    if (displayValue.charAt(0) === '-') {
        displayValue = displayValue.slice(1);
    } else {
        displayValue = `-${displayValue}`;
    }
    document.getElementById('valor').textContent = displayValue;
}
