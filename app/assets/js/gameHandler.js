document.addEventListener("gameLoaded", function(){
    console.log("Game initialized correctly!!!");

    startgame();
});

function mark(id){
    console.log("Cell " + id + "  has been clicked! ");

    document.getElementById(id).style.pointerEvents = "none";
}

function startgame(){
    
}