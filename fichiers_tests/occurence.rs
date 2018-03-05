fn first_occ(chaine : Vec<idf>, car : idf) -> i32 {
	let i = 0;
	while chaine[i]!='\0' {
		if chaine[i] == car{
		let i = i +1;
		return i;
		}
		let i = i + 1;
	}
	return 0;
}

fn last_occ(chaine : Vec<idf>, car : idf) -> i32 {
	let i = 0;
	let retenu = 0;
	while (chaine[i]!='\0'){
		if chaine[i] == car {
			let retenu = i;
		}
		let i = i + 1;
	}
	let retenu = retenu + 1;
	return retenu;
}

fn main(){
	let chaine = Vec![t, e, s, t];
	print!(last_occ(chaine, t));
	print!(first_occ(chaine, s));
}