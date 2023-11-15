window.addEventListener("load", async function () {
    await init();
});

async function init() {
    

    await initMap();

    await initPlayers();

    return new Promise((resolve, reject) => {
        const gameLoaded = new Event('gameLoaded');
        this.document.dispatchEvent(gameLoaded);
        
        resolve();
    })

}

function initMap() {

    return new Promise((resolve, reject) => {
        var map = this.document.getElementById("0");

        for (let i = 1; i < 10; i++) {

            var inner = this.document.createElement("div");
            inner.className = "inner";
            inner.id = i;

            for (let j = 1; j < 10; j++) {

                let cell = this.document.createElement("div");
                cell.className = "cell";

                cell.id = "" + i + j;
                inner.append(cell);

            }
            map.append(inner);
        }
        console.log(map);
        resolve();
    });

}

function initPlayers() {

    return new Promise((resolve, reject) => {
        var player1 = document.createElement("div");
        var player2 = document.createElement("div");

        player1.id = "player1";
        player2.id = "player2";





        this.document.body.append(player1);
        this.document.body.append(player2);
        console.log(player1, player2);

        

        resolve();
    })

}



