// swift-tools-version: 5.9
import PackageDescription

let package = Package(
    name: "SunmiBarcodeScanner",
    platforms: [.iOS(.v14)],
    products: [
        .library(
            name: "SunmiBarcodeScanner",
            targets: ["SunmiBarcodePlugin"])
    ],
    dependencies: [
        .package(url: "https://github.com/ionic-team/capacitor-swift-pm.git", from: "7.0.0")
    ],
    targets: [
        .target(
            name: "SunmiBarcodePlugin",
            dependencies: [
                .product(name: "Capacitor", package: "capacitor-swift-pm"),
                .product(name: "Cordova", package: "capacitor-swift-pm")
            ],
            path: "ios/Sources/SunmiBarcodePlugin"),
        .testTarget(
            name: "SunmiBarcodePluginTests",
            dependencies: ["SunmiBarcodePlugin"],
            path: "ios/Tests/SunmiBarcodePluginTests")
    ]
)