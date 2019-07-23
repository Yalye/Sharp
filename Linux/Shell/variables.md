### list
strings=(
    string1
    string2
    "string with spaces"
    stringN
)
for i in "${strings[@]}"; do
    echo "$i"
done