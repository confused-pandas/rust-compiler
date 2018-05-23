fn pascal(i : i32, j : i32) -> i32 {
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
		let mut u = i-1;
		let mut v = j-1;
		let mut res = pascal(u, j) + pascal(u, v);
		return res;
	}

}

fn triangle(taille : i32) {
	let mut i = 0;
	let mut j = 0;
	let mut pij=0;
	while i <= taille {
		while j <= i {
			let mut pij = pascal(i,j);
			let mut j = j + 1;
			print!(pij);
		}
		let mut i = i + 1;
		print!(pij);
	}
}

fn main() {
	triangle(5);
}