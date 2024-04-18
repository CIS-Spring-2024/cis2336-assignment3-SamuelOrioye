<script>
    function submitOrder() {
        var bbqQuantity = document.getElementById("bbqQuantity").value;
        var buffaloQuantity = document.getElementById("buffaloQuantity").value;
        var classicQuantity = document.getElementById("classicQuantity").value;
        
        // Validate quantities
        if (bbqQuantity < 0 || buffaloQuantity < 0 || classicQuantity < 0) {
            alert("Quantity cannot be negative.");
            return;
        }
        
        // Process order (send data to server or handle locally)
        console.log("Order placed!");
        
        // Optionally, clear the form after submission
        document.getElementById("orderForm").reset();
    }
</script>
