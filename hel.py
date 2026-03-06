import sys

# Get the message from command line arguments or use a default
msg = sys.argv[1] if len(sys.argv) > 1 else "No message provided"

print(f"Python says: {msg}")
print("Hello from Jenkins (via Python)!")