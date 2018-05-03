fn main() {
    let mut total = 0;
    let mut i = 0;
    let n = 10;

    let mut test = i <= n;
    while test
    {
        let total = total + i * i;
        let i = i + 1;

        if i == 5
        {
            print!(i)
        }

        let test = i <= n;
    }

    print!(total);
}
