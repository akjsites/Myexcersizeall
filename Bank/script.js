// Use localStorage to store accounts persistently
let accounts = JSON.parse(localStorage.getItem("accounts")) || [];
let nextId = accounts.length ? Math.max(...accounts.map(a=>a.id))+1 : 1;

// Create account
function createAccount(name, balance){
    const acc = { id: nextId++, name, balance };
    accounts.push(acc);
    localStorage.setItem("accounts", JSON.stringify(accounts));
}

// Deposit
function deposit(id, amount){
    const acc = accounts.find(a=>a.id===id);
    if(acc){
        acc.balance += amount;
        localStorage.setItem("accounts", JSON.stringify(accounts));
        return true;
    }
    return false;
}

// Withdraw
function withdraw(id, amount){
    const acc = accounts.find(a=>a.id===id);
    if(acc && acc.balance >= amount){
        acc.balance -= amount;
        localStorage.setItem("accounts", JSON.stringify(accounts));
        return true;
    }
    return false;
}

// Render accounts table
function renderAccounts(){
    const table = document.getElementById("accountsTable");
    if(!table) return;
    table.innerHTML = `<tr><th>ID</th><th>Name</th><th>Balance</th></tr>`;
    accounts.forEach(acc=>{
        const row = table.insertRow();
        row.insertCell(0).innerText = acc.id;
        row.insertCell(1).innerText = acc.name;
        row.insertCell(2).innerText = acc.balance.toFixed(2);
    });
}
