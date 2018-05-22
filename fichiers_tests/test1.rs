fn main() 
{
	let a = 5;
	let mut b = 10 + a * 2 / 4 - 5;
	if_test(a,b);

	let mut c = 4;

	while (c <= 5) {
		let c = c + 1;
	}

	print!(if_test(6,5));
	print!(if_test(3,5));
	print!(c);
}

fn if_test(x : i32, y : i32) -> i32 {
	if (x > y) {
		return x;
	}
	else {
		return y;
	}
}

struct structure 
{
	m : i32, 
	n : i32, 
	b : bool
}

