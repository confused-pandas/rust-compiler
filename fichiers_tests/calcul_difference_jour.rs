fn est_bisextile (annee : i32 ) -> bool {
	/* permet de verifier si l'annee est bisextile*/
	let mut mult4 = annee/4;
	let mut rest4 = annee-mult4*4;
	let mut mult100 = annee/100;
	let mut res100 = annee-mult100*100;
	let mut mult400 = annee/400;
	let mut res400 = annee-mult400*400;

	if (res4 == 0) && (res100 != 0) || (res400 == 0){
		return true;
	}
	else {
			return false;
	}
}

fn nb_jour_total (jour : i32, mois : i32, annee : i32) -> i32 {
	/* on calcul il y a de jours entre le debut de l'annee et le jour choisi*/
	 let mut i = 0;
	 let mut delta = 0;
	 let mut Mois = vec![31,28,31,30,31,30,31,31,30,31,30,31];

	 if (jour > Mois[mois] || jour < 1) {
	    return 0;

	 }
	 else {

	 	if (mois == 1) {
	 		let mut delta = jour;
		 }

	 	else {

	 			let mut m = mois - 1;
	 			/* on ajoute les jours des mois précédents */
	 			while (i < m) {
	 				let mut delta = delta + Mois[i];
	 			}

	 			let mut delta = delta + jour;

	 	}

	 	/* cas ou l'annee est bisextile*/
	 	if (mois > 2 && est_bisextile(annee) == true) {
	 		let mut delta = delta + 1;
	 	}
	 }
}

fn difference (jour1 : i32, jour2 : i32, mois1 : i32, mois2 : i32, annee1 : i32, annee2 : i32) {
	 	
	 	let mut diff = 0;
	 	let mut total1 = nb_jour_total(jour1, mois1, annee1);
	 	let mut total2 = nb_jour_total(jour2, mois2, annee2);

	 	if (annee1 == annee2) {
	 		let mut diff = total2 - total1;
	 	}
	 	else {
	 		let mut i = 0;
	 		let mut n = annee2 - annee1;
	 		while (i<n) {
	 			let mut diff = diff + 364;
	 			let mut j = annee1 + i;
	 			if est_bisextile(j) == true {
	 				let mut diff = diff + 1;
	 			}
	 			let mut i = i + 1;
	 		}
	 		let mut diff = diff - total1;
	 		let mut diff = diff + total2 + 1;
	 	}
	 print!(diff);
}

fn main() {
	difference(20,19,4,3,2008,2016);
}
