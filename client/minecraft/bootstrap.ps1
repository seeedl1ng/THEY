$Config = "$PSScriptRoot\config\.notfirst"
$Bootstrap = "$PSScriptRoot\packwiz-installer-bootstrap.jar"
$Version ="0.2pre6"
if (-not (Test-Path $Config))
{
	Write-Host "First launch"

	New-Item (Split-Path $Config) -ItemType Directory -Force | Out-Null

	Invoke-WebRequest `
		-Uri "https://github.com/packwiz/packwiz-installer-bootstrap/releases/latest/download/packwiz-installer-bootstrap.jar" `
		-OutFile $Bootstrap

	# Скачать ассеты
	# ...

	New-Item $Config -ItemType File | Out-Null
}

java -jar $Bootstrap pack.toml
