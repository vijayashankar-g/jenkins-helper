def data = [
    ['Name', 'Age', 'Country'],
    ['John', 25, 'USA'],
    ['Alice', 30, 'Canada'],
    ['Bob', 28, 'UK']
]

def columnWidths = [10, 6, 10]

// Function to create a formatted row
def createRow(rowData, columnWidths) {
    def row = "|"
    for (int i = 0; i < rowData.size(); i++) {
        def cellData = rowData[i].toString()
        def width = columnWidths[i]
        def cell = String.format("%-${width}s", cellData)
        row += " ${cell} |"
    }
    row
}

// Print table header
def header = createRow(data[0], columnWidths)
println(header)
println("-" * header.length())

// Print table data
for (int i = 1; i < data.size(); i++) {
    def row = createRow(data[i], columnWidths)
    println(row)
}
