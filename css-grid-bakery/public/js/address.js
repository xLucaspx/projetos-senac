(async () => {
	const cepInput = document.getElementById('cep');
	const streetInput = document.getElementById('street');
	const districtInput = document.getElementById('district');
	const cityInput = document.getElementById('city');

	cepInput.addEventListener('change', async () => {
		cep = cepInput.value;

		if (!cep.match(/\d{5}-?\d{3}/)) {
			return;
		}

		const res = await fetch(`https://viacep.com.br/ws/${cep}/json`, {
			headers: { 'Content-Type': 'application/json' }
		});

		const address = await res.json();

		streetInput.value = address.logradouro;
		districtInput.value = address.bairro;
		cityInput.value = `${address.localidade} - ${address.uf}`;
	});
})();
