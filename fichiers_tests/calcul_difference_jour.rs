fn est_bisextile (annee : i32 ) -> bool {
	/* permet de verifier si l'annee est bisextile*/
	let mult4 = annee/4;
	let rest4 = annee-mult4*4;
	let mult100 = annee/100;
	let res100 = annee-mult100*100;
	let mult400 = annee/400;
	let res400 = annee-mult400*400;

	if (res4 == 0 && res100 != 0) || res400 == 0){
		print!("L'annee est bisextile");
		return true;
	}
	else {
			print!("L'annee n'est pas bisextile");
			return false;
	}
}

fn nb_jour_total (jour : i32, mois : i32, annee : i32) -> i32 {
	/* on calcul il y a de jours entre le debut de l'annee et le jour choisi*/
	 let i = 0;
	 let delta = 0;
	 let Mois = Vec<i32>[31,28,31,30,31,30,31,31,30,31,30,31];

	 if jour > Mois[mois] || jour < 1 {
	 	print!("erreur le numero du jour est incorrect")

	 }
	 else {

	 	if mois == 1 {
	 		let delta = jour;
		 }

	 	else {

	 			let m = mois - 1;
	 			/* on ajoute les jours des mois précédents */
	 			while i < m {
	 				let delta = delta + Mois[i];
	 			}

	 			let delta = delta + jour;

	 	}

	 	/* cas ou l'annee est bisextile*/
	 	if mois > 2 && est_bisextile(annee) == true {
	 		let delta = delta + 1;
	 	}
	 }
}

fn difference (jour1 : i32, jour2 : i32, mois1 : i32, mois2 : i32, annee1 : i32, annee2 : i32) {
	 	
	 	let diff = 0;
	 	let total1 = nb_jour_total(jour1, mois1, annee1);
	 	let total2 = nb_jour_total(jour2, mois2, annee2);

	 	if annee1 == annee2 {
	 		let diff = total2 - total1;
	 	}
	 	else {
	 		let i = 0;
	 		let n = annee2 - annee1;
	 		while i<n {
	 			let diff = diff + 364;
	 			let j = annee1 + i;
	 			if est_bisextile(j) == true {
	 				let diff = diff + 1;
	 			}
	 			let i = i + 1;
	 		}
	 		let diff = diff - total1;
	 		let diff = diff + total2 + 1;
	 	}

	 print!("Il y a :");
	 print!(diff);
	 print!("jours de difference");
}

fn main() {
	difference(20,19,4,3,2008,2016);
}
