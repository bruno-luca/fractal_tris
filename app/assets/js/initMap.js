window.addEventListener("load", function () {
    var map = this.document.getElementById("0");

    for(let i = 1; i < 10; i++){

        var inner = this.document.createElement("div");
        inner.className = "inner";

        for(let j = 1; j < 10; j++){

            let cell = this.document.createElement("div");
            cell.className = "cell";

            cell.id = "" + i + j;

            inner.append(cell);

            cell.innerHTML = "" + i + j;

            cell.addEventListener("click", function(){
                mark(cell.id);
            });

        }

        map.append(inner);
    }

    console.log(map);
});



// document.addEventListener("click", function(){
//     console.log("scemo chi legge");
// })
