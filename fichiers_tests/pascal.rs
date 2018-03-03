fn pascal(i : i32, j : i32){
	if j == 0{
		return 1;
	}
	else if i== j {
		return 1;
	}
	else if i < j {
		return 0;
	}
	else {
		let u = i-1;
		let v = j-1;
		let res = pascal(u, j) + pascal(u, v);
		return res;
	}

}

fn triangle(taille : i32) {
	let i = 0;
	let j = 0;
	while i <= taille {
		while j <= i {
			let pij = pascal(i,j);
			let j = j + 1;
			print!(pij);
		}
		let i = i + 1;
		print!(pij);
	}
}

fn main() {
	triangle(5);
}