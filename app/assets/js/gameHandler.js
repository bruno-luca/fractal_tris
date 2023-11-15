var p1 = (Math.random() > 0.5) ? true: false;

const lineeVincita = [
    [0, 1, 2], [3, 4, 5], [6, 7, 8], // Righe
    [0, 3, 6], [1, 4, 7], [2, 5, 8], // Colonne
    [0, 4, 8], [2, 4, 6]             // Diagonali
];

document.addEventListener("gameLoaded", function(){
    console.log("Game initialized correctly!!!");

    

    console.log("player1", p1);
    startgame();

    
});

function mark(id){
    console.log("Cell " + id + "  has been clicked! ");
    console.log("player1", p1);
    console.log("id", id, typeof id);

    let cell = document.getElementById(id);

    if(p1){
        cell.style.backgroundColor = "green";
    }else{
        cell.style.backgroundColor = "yellow";
    }

    p1 = !p1;
    cell.style.pointerEvents = "none";
    
    let status = checkWin(document.getElementById(id[0]));
    console.log(status);
}

function startgame(){
    var cells = document.getElementsByClassName("cell");

    for(let i = 0; i < cells.length; i++) cells[i].addEventListener("click", ()=>{mark(cells[i].id)});
}

function checkWin(cells){
    console.log(typeof cells, cells);
    for (const linea of lineeVincita) {
        const [a, b, c] = linea;
        if (cells[a].style.backgroundColor === cells[b].style.backgroundColor && cells[a].style.backgroundColor === tabella[c].style.backgroundColor) {
            return cells[a].style.backgroundColor;
        }
    }

    return -1;
}