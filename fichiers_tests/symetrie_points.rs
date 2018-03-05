struct Point{
	id : i32,
	x : i32,
	y : i32
}

fn affiche_id(p : Point){
	print!(p.id);
}

fn affiche_x(p : Point){
	print!(p.x);
}

fn affiche_y(p: Point){
	print!(p.y);
}
fn symetrique(p : Point, choix: i32) -> i32 {
	if choix == 0 {
		let x_2 = p.x;
		let y_2 = -p.y;
		let p.x = x_2;
		let p.y = y_2;
		affiche_x(p);
		affiche_y(p);
		return 1;
	}
	else if choix == 1 {
		let x_2 = -p.x;
		let y_2 = p.y;
		let p.x = x_2;
		let p.y = y_2;
		affiche_x(p);
		affiche_y(p);
		return 1;
	}
	else if choix == 2 {
		let x_2 = -p.x;
		let y_2 = -p.y;
		let p.x = x_2;
		let p.y = y_2;
		afiche_x(p);
		affiche_y(p);
		return 1;
	}
	else {
		return 0;
	}
}


fn main(){
	let A  = Point {id : 12,x : 4,y : 3};
	let B = Point {id : 15, x : 9, y : -3};
	affiche_id(A);
	affiche_id(B);
	symetrique(A,0);
	symetrique(B,1);
	symetrique(A,2);

}