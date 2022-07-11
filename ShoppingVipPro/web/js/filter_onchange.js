const filterProd = document.getElementById('filter-prod');
filterProd.onchange = function() {
    if(filterProd.value!=='0')
    location.href = 'http://localhost:8080/ShoppingVipPro/filter-select?selectId='+filterProd.value;
};