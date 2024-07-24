(async () => {
	const db = await fetch('../../db.json');
	const res = await db.json();

	const productsList = document.querySelector(".products__list");

	res.books.forEach(product => {
		const li = document.createElement('li');
		li.classList.add('products__list__item');
		li.title = `${product.title + ' | ' + product.author}`;

		const html = `
			<img src="../assets/img/books/${product.imageUrl}" alt class="product__list__item__img">

			<h3 class="product__list__item__title">${product.title}</h3>
			<p class="product__list__item__info">${product.author}
			<p class="product__list__item__price">$ ${product.price.toFixed(2)}</p>
		`
		li.innerHTML = html;

		productsList.appendChild(li)
	})
})();
