document.addEventListener('DOMContentLoaded', function() {
    console.log('Uygulama yüklendi!');
    
    // Örnek bir event listener ekleyebilirsiniz
    document.querySelectorAll('.image-container img').forEach(img => {
        img.addEventListener('click', () => {
            console.log('Resme tıklandı:', img.alt);
        });
    });
});