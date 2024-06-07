(async () => {
	const db = await fetch('../../db.json');
	const res = await db.json();

	const productsList = document.querySelector(".products__list");

	console.log(res.products);

	res.products.forEach(product => {
		const li = document.createElement('li');
		li.classList.add('products__list__item');

		const html = `
			<img src="./assets/img/products/${product.imageUrl}" alt="${product.imageAlt}" class="product__list__item__img">

			<h3 class="product__list__item__name">${product.name}</h3>
			<p class="product__list__item__price">$ ${product.price.toFixed(2)}</p>
		`
		li.innerHTML = html;

		productsList.appendChild(li)
	})
})();
