(() => {
	const nameInput = document.getElementById('name');
	const birthInput = document.getElementById('birth');
	const emailInput = document.getElementById('email');
	const phoneInput = document.getElementById('phone');
	const cepInput = document.getElementById('cep');
	const streetInput = document.getElementById('street');
	const districtInput = document.getElementById('district');
	const numberInput = document.getElementById('number');
	const cityInput = document.getElementById('city');
	const justificationInput = document.getElementById('justification');

	const form = document.querySelector('.subscribe__form');

	form.onsubmit = (event) => {
		event.preventDefault();

		const name = nameInput.value;
		const [year, month, day] = birthInput.value.split('-');
		const email = emailInput.value;
		const phone = phoneInput.value;
		const cep = cepInput.value;
		const street = streetInput.value;
		const district = districtInput.value;
		const number = numberInput.value;
		const city = cityInput.value;
		const justification = justificationInput.value;

		const output = `--- Comprovante de inscrição ---
        
- Dados pessoais -
	Nome: ${name}
	Data de nascimento: ${day}/${month}/${year}
	Endereço: ${street}, ${number ? number : 'S/Nº'}, Bairro ${district}, ${city}. CEP ${cep}

- Informações de contato -
	E-mail: <${email}>
	Telefone: ${phone}

- Justificativa -
	${justification}

---

Este é apenas o comprovante de inscrição, documento que comprova que recebemos sua solicitação de associação ao clube.
Iremos avaliar as informações e posteriormente entraremos em contato para dar seguimento ao processo, conforme estipulado nas regras do estatuto.

Em caso de dúvidas, por favor nos contate em <ajuda-onemore@email.com>.

One more... Coffee Shop and Book Store
`;

		const link = document.createElement('a');
		link.setAttribute('download', `comprovante-inscricao.txt`);

		const data = new Blob([output], { type: 'text/plain' });
		const fileUrl = window.URL.createObjectURL(data);

		link.href = fileUrl;
		document.body.appendChild(link);

		// wait for the link to be added to the document
		window.requestAnimationFrame(function () {
			link.dispatchEvent(new MouseEvent('click'));
			document.body.removeChild(link);
		});

		alert("Inscrição realizada com sucesso, verifique seu comprovante para maiores informações!\n");

		nameInput.value = "";
		birthInput.value = "";
		emailInput.value = "";
		phoneInput.value = "";
		cepInput.value = "";
		streetInput.value = "";
		districtInput.value = "";
		numberInput.value = "";
		cityInput.value = "";
		justificationInput.value = "";
	}
})();
