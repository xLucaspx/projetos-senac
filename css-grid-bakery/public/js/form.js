(() => {
    let orderNumber = 1;

    const nameInput = document.getElementById('name');
    const phoneInput = document.getElementById('phone');
    const cepInput = document.getElementById('cep');
    const streetInput = document.getElementById('street');
    const districtInput = document.getElementById('district');
    const numberInput = document.getElementById('number');
    const cityInput = document.getElementById('city');
    const orderInput = document.getElementById('order');

    const form = document.querySelector('.contact__form');

    form.onsubmit = (event) => {
        event.preventDefault();

        const name = nameInput.value;
        const phone = phoneInput.value;
        const cep = cepInput.value;
        const street = streetInput.value;
        const district = districtInput.value;
        const number = numberInput.value;
        const city = cityInput.value;
        const order = orderInput.value;

        const output = `*** Pedido ${orderNumber} ***
        
- Dados do cliente -
	Nome: ${name}
	Telefone: ${phone}

- Endereço de entrega -
	${street}, ${number ? number : 'S/Nº'}, Bairro ${district}, ${city}. CEP ${cep}

- Pedido -
	${order.replaceAll('\n', '\n	')}
        `;


        const link = document.createElement('a');
        link.setAttribute('download', `pedido_${orderNumber}.txt`);

        const data = new Blob([output], {type: 'text/plain'});
        const fileUrl = window.URL.createObjectURL(data);

        link.href = fileUrl;
        document.body.appendChild(link);

        // wait for the link to be added to the document
        window.requestAnimationFrame(function () {
            link.dispatchEvent(new MouseEvent('click'));
            document.body.removeChild(link);
        });

        orderNumber++;
    }
})();
