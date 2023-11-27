beeGame = {};

beeGame.init = function() {
    beeGame.flowerCount = 0;
    beeGame.lifeCount = 5;
    beeGame.level = 1;
    beeGame.growFlowers('flower1');
    beeGame.growFlowers('flower2');
    beeGame.growFlowers('flower3');
    beeGame.flowerClick();
    beeGame.waspHover();
    beeGame.mouseMove();
    beeGame.restart();
    beeGame.flashRed('footer');
    document.getElementById('field').onmousemove = beeGame.mouseMove;
    beeGame.bigWasp = document.getElementById('bigWasp');
    beeGame.animationDuration = 20;
};    

beeGame.mouseMove = function(mouseMovement) {
    // when the mouse moves, set xPosition and yPosition to the x and y of the cursor,
    // then assign those x and y to the bee in the css file (position absolute, use top and left)
    const bee = document.getElementById('bee');
    let xPosition;
    let yPosition;
    if (mouseMovement) {
        xPosition = mouseMovement.pageX;
        yPosition = mouseMovement.pageY;
        bee.style.top = yPosition + 1 + 'px';
        // added 1 pixel to get the bee off of the cursor itself so you're clicking on what you want to click on not the bee image
        bee.style.left = xPosition + 'px';
    };
};


beeGame.growFlowers= function(flowerId) {
    // takes a flowerId, gets that element from the DOM and changes it's position to a new random position
    const flower = document.getElementById(flowerId);
    let randomX = Math.floor(Math.random() * 80) + 5;
    let randomY = Math.floor(Math.random() * 70) + 10;
    flower.style.top = randomY + 'vh';
    flower.style.left = randomX + '%';
};

beeGame.growNewFlower = function (flowerArray) {
    // takes in two arrays representing the rgb values, 
    // then grows a brand new flower and add it to the html
    // const red

};

beeGame.flowerClick = function() {
    $('.flower').on('click', function () {
        // when user clicks a flower, add one to the flower count (a.k.a score), get rid of that flower and grow a new flower
        beeGame.flowerCount += 1;
        if (beeGame.flowerCount % 5 === 0){
          beeGame.level += 1;  
          beeGame.flashRed('footer');
          beeGame.enemyMove();
            // $('span.level').text(beeGame.level);
          beeGame.updateSpan('.level', beeGame.level);
         }
        // $('span.flowers').text(beeGame.flowerCount);
      beeGame.updateSpan('.flowers', beeGame.flowerCount);
        let clickedId = $(this).attr('id');
        return (beeGame.growFlowers(clickedId));
    });
};

beeGame.waspHover = function() {
    $('.wasp').hover(function () {
        // when user clicks a flower, add one to the flower count (a.k.a score), get rid of that flower and grow a new flower
        beeGame.lifeCount -= 1;
        beeGame.flashRed('header');
        // $('span.lives').text(beeGame.lifeCount);
      beeGame.updateSpan('.lives', beeGame.lifeCount);
        if (beeGame.lifeCount <= 0) {
            $('a.tweet').attr('href', `https://twitter.com/intent/tweet?text=I made it to level ${beeGame.level} in @AmieEverett_'s Bee Game! 🐝`);
            // $('span.level').text(beeGame.level);
          beeGame.updateSpan('.level', beeGame.level);
            $('aside').css({
                'bottom': '0',
            });
        }
    });
};

beeGame.enemyMove = function() {
    // makes enemy movement faster and more random to increase difficulty
    console.log(beeGame.animationDuration,' seconds');
    const bezier1 = Math.random();
    const bezier2 = Math.random();
    const bezier3 = Math.random();
    const cubicBezier = `cubic-bezier(${bezier1}, ${bezier2}, ${bezier3}, 1)`;

    if (beeGame.animationDuration > 5) {
        beeGame.animationDuration -= 5;
    } else {
        for (i=1; i<=4; i++){
            const newSpeed = Math.floor(Math.random()*5)+1;
            // console.log($('.wasp')[i]);
            // console.log($(`.wasp${i}`));
            $(`.wasp${i}`).css({
                'animation-duration': `${newSpeed}s`,
                'animation-timing-function': `${cubicBezier}`
            });
        }
    }
    $('.bigWasp').css({
        'animation-duration': `${beeGame.animationDuration}s`,
        'animation-timing-function': `${cubicBezier}`
    });
};

beeGame.flashRed = function(redElement) {  
    $(redElement).addClass('flashRed');
    setTimeout(function() {
        $(redElement).removeClass('flashRed');
    }, 1000);
};

beeGame.restart = function(){
    $('button').on('click', function () {
        window.location = '';
    });
};

beeGame.updateSpan = function(spanClass, updatedData) {
    $('span' + spanClass).text(updatedData);
}

beeGame.konamiEgg = new Egg();
beeGame.konamiEgg.addCode('up,up,down,down,left,right,left,right,b,a', function () {
        jQuery('#konamiEgg').text('Easter egg found!');
        beeGame.level = 10;
        beeGame.lifeCount = 10;
        beeGame.updateSpan('.level', beeGame.level);
        beeGame.updateSpan('.lives', beeGame.lifeCount);
        beeGame.flashRed('header');
        beeGame.flashRed('footer');
        window.setTimeout(function () { jQuery('#konamiEgg').hide(); }, 1000);
        
    })
    .addHook(function () {
        console.log('Easter egg found!');
    }).listen();

$(beeGame.init());
