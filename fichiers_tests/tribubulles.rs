fn echange(tab : Vec<i32>, i : i32, j : i32){
	let interm = tab[i];
	let tab[i] = tab[j];
	let tab[j] = interm;
}

fn tribubulles (tab : Vec<i32>, taille : i32 ){
	let test = true;
	if tab.len() > 0 {
		while test == true{
			let test = false;
			let i = 0;
			let j = 1;
			while i < tab.len() {
				if tab [i] > tab [j] {
					echange(i,j);
					let test = true;
				}
				let i = i + 1;
				let j = j + 1;
			}
		}
	}
}

fn main(){
	tab = vec{1,8,9,10,1452,31553,81,0};
	tribubulles(tab);
}