fn echange(tab : Vec<i32>, i : i32, j : i32){
	let mut interm = tab[i];
	let mut tab[i] = tab[j];
	let mut tab[j] = interm;
}

fn tribubulles (tab : Vec<i32>, taille : i32 ){
	let mut test = 0;
	if tab.len() > 0 {
		while test == 0{
			let test = 1;
			let mut i = 0;
			let mut j = 1;
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
	let tab = vec![1,8,9,10,1452,31553,81,0];
	tribubulles(tab);
}