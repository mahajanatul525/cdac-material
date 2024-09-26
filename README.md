# draw.io CSV format
# label: The text inside the shape
# shape: Shape type (ellipse, rectangle, rhombus, etc.)
# style: Optional formatting (solid, dashed, fill color, etc.)
# parent: Defines connections between shapes

"label","shape","style","parent"
"Financial Rule Engine","rectangle","fillColor=#FFD700",""
"API Request","ellipse","fillColor=#ADD8E6","Financial Rule Engine"
"forceLookup=true?","rhombus","fillColor=#FFCCCB","API Request"
"Snowflake (Fetch Data)","rectangle","fillColor=#B0E57C","forceLookup=true?"
"Redis Cache (Azure)","rectangle","fillColor=#FFA07A","forceLookup=true?"
"Return Data from Redis","ellipse","fillColor=#ADD8E6","Redis Cache (Azure)"
"Update Cache (Redis)","ellipse","fillColor=#FFA07A","Snowflake (Fetch Data)"
"Service Request via Redis","ellipse","fillColor=#FFA07A","Redis Cache (Azure)"
"Refresh Cache every 10 mins","ellipse","fillColor=#FFD700","Update Cache (Redis)"
"Kubernetes (Azure)","rectangle","fillColor=#87CEEB","Financial Rule Engine"
"Network Resource Group","rectangle","dashed=1","Financial Rule Engine"
