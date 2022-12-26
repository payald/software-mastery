import TableData from "./TableData";

const getHeaderData = (columns) => {
    return <tr>{
            columns.map((data)=>{
                return <th key={`header-${data}`}>{data}</th>
            })}
            </tr>
}

const getBodyData = (columns) => {
    return TableData.map((data)=>{
        return <tr key={`row-${data.id}`}>
            {columns.map((col)=>{
                return <td key={`cell-${data.id}-${col}`}>{data[col]}</td>
            })}
        </tr>
    });
}

const DynamicTable=()=>{
    const columns = Object.keys(TableData[0]);
    return <table className="table">
        <thead>{getHeaderData(columns)}</thead>
        <tbody>{getBodyData(columns)}</tbody>
    </table>

}
export default DynamicTable;