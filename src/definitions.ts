export interface SunmiBarcodePlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
