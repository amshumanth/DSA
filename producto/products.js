let products = [];

function addProduct() {
  const pid = document.getElementById('pid').value;
  const pname = document.getElementById('pname').value;
  const price = parseFloat(document.getElementById('price').value);
  const qty = parseInt(document.getElementById('qty').value);

  if (!pid || !pname || isNaN(price) || isNaN(qty)) {
    alert("Please enter valid product details.");
    return;
  }

  products.push({ pid, pname, price, qty });
  displayProducts();
  clearForm();
}

function displayProducts() {
  const tbody = document.querySelector("#productTable tbody");
  tbody.innerHTML = "";

  products.forEach((product, index) => {
    const row = `
      <tr>
        <td>${product.pid}</td>
        <td>${product.pname}</td>
        <td>${product.price.toFixed(2)}</td>
        <td>${product.qty}</td>
        <td>
          <button onclick="updateProduct(${index})">Update</button>
          <button onclick="deleteProduct(${index})">Delete</button>
        </td>
      </tr>`;
    tbody.innerHTML += row;
  });
}

function deleteProduct(index) {
  products.splice(index, 1);
  displayProducts();
}

function updateProduct(index) {
  const product = products[index];
  document.getElementById('pid').value = product.pid;
  document.getElementById('pname').value = product.pname;
  document.getElementById('price').value = product.price;
  document.getElementById('qty').value = product.qty;
  deleteProduct(index);
}

function clearForm() {
  document.getElementById('pid').value = '';
  document.getElementById('pname').value = '';
  document.getElementById('price').value = '';
  document.getElementById('qty').value = '';
}
