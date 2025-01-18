import sys,subprocess,shutil,os,json
version = "1.0"

def main():
    
    parsedArgs = parseArgs()
    
    
def parseArgs():
    try:
        
        if "clean" in sys.argv: cleanUp()
        if "build" in sys.argv: prepareProject()
        if "--help" in sys.argv or "help" in sys.argv: 
            displayHelp()
    except:
        displayHelp()
    
def prepareProject():
    os.mkdir("./tmp/")
    os.mkdir("./tmp/staging/")
    #os.mkdir("./tmp/staging/src/")
    with open("./tmp/staging/Manifest.txt", "w") as fd:
        manifest = fd
        manifest.write(f"Manifest-Version: {version}\nMain-Class: {'StrategyGame'}")
        fd.close()
    subprocess.run(["javac", "-d", "./tmp/staging/", f"./src/*.java"])
    os.chdir("./tmp/staging")
    subprocess.run(["jar", "-cvfme", f"../../StrategyGame.jar", "./Manifest.txt", "StrategyGame", "./*.class"])
    os.chdir("../../")
    shutil.rmtree("./tmp/", ignore_errors=True)


def cleanUp():
    shutil.rmtree("./tmp/", ignore_errors=True)
    
def displayHelp():
    print("Synopsis")
    print()
    print()
    print()
    print()
    print()
    print()
    print()
    sys.exit()
    
def run():
    subprocess.run(["java", "-jar", f"./StrategyGame.jar"])

if __name__ == "__main__":
    main()