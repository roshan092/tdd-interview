console.log('Inside script');
var changeColor = function () {
    console.log('Inside function');
    var inputElements = document.getElementsByClassName('text-input');
    var color = inputElements[0].value;
    var outputElements = document.getElementsByClassName('text-output');
    outputElements[0].style.color = color;
};