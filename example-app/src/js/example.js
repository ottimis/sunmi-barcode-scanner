import { SunmiBarcode } from 'sunmi-barcode-scanner';

window.testEcho = () => {
    const inputValue = document.getElementById("echoInput").value;
    SunmiBarcode.echo({ value: inputValue })
}
