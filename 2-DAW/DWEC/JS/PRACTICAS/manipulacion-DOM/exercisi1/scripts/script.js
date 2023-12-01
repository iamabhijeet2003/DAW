window.onload = function() {
    numeroDeEnlaces();
    cambiarImagenLogo();
    cambiarTexto();
    quitarFavoriteLinks();
    quitarEnlacesFavoriteLinks();
}

function numeroDeEnlaces(){
    var enlaces = document.getElementsByTagName('a');
    alert('Número de enlaces en la página: ' + enlaces.length);
}

function cambiarImagenLogo(){
    var logo = document.querySelector('#header img');
    logo.src = 'images/logo.jpeg';
}

function cambiarTexto(){
    var menuItems = document.querySelectorAll('#menu ul li a');
        for (var i = 0; i < menuItems.length; i++) {
            var item = menuItems[i];
            
            item.textContent = 'Nuevo Texto ' + (i + 1);
        }
}

function quitarFavoriteLinks(){    
       
        var rightColumn = document.querySelector('.floatRight.width25.lightBlueBg.horzPad');
        
        
        var headers = rightColumn.getElementsByTagName('h3');
        for (var i = 0; i < headers.length; i++) {
            if (headers[i].textContent.includes('Favorite Links')) {
                
                rightColumn.removeChild(headers[i]);
            break;
            }
        };
    
}

function quitarEnlacesFavoriteLinks() {
    
    
    var selected = document.querySelectorAll(".submenu2");

    var pare = selected[1].parentNode;
    var fill = selected[1];
    pare.removeChild(fill);
}


